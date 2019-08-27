package com.pepe.zhihu.mvp.presenter;

import android.app.ProgressDialog;
import android.widget.ProgressBar;

import com.pepe.zhihu.bean.Collection;
import com.pepe.zhihu.bean.ListBean;
import com.pepe.zhihu.bean.User;
import com.pepe.zhihu.http.HttpCallBack;
import com.pepe.zhihu.http.HttpUtils;
import com.pepe.zhihu.http.ICancelable;
import com.pepe.zhihu.http.convert.JsonConvert;
import com.pepe.zhihu.http.retrofit.HttpSubscriber;
import com.pepe.zhihu.http.retrofit.RetrofitRequest;
import com.pepe.zhihu.mvp.contract.IMainContract;
import com.pepe.zhihu.mvp.presenter.base.BasePresenter;
import com.pepe.zhihu.utils.LogUtil;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Response;

/**
 * @author 1one
 * @date 2019/8/27.
 */
public class MainPresenter extends BasePresenter<IMainContract.View>
        implements IMainContract.Presenter {

    @Inject
    public MainPresenter() {
        super();
    }

    @Override
    public void simpleGetRequest() {
        // http://chepai.ketao.com/api/goods/info?goodsid=xxx
        String baseUrl = "https://api.github.com/users/";
        String userName = "494778200pepe";
        String url = baseUrl + userName;
        ICancelable cancelable = HttpUtils.with(getContext())
                .get()
                .url(url)
                .httpRequest(new RetrofitRequest())
                .progressBar(mView.getProgressDialog())
                .param("iid", null)
                .param("aid", null)
                .request(new HttpCallBack<User>() {
                    @Override
                    public void onFailure(Exception e) {
                        LogUtil.d("MainPresenter onFailure");
                    }

                    @Override
                    protected void onSuccess(User user) {
                        LogUtil.d("MainPresenter onSuccess");
                        LogUtil.d("MainPresenter user.id = " + user.getId());
                    }
                });
        addRequest(cancelable);
    }

    @Override
    public void simpleGetRequestForJson() {
//        String url = "https://api.github.com/users/%s/repos";
//        String userName = "494778200pepe";
//        url = String.format(url, userName);
        String url = "http://chepai.ketao.com/api/goods/list";
        ICancelable cancelable = HttpUtils.with(getContext())
                .get()
                .url(url)
                .httpRequest(new RetrofitRequest())
                .progressBar(new ProgressDialog(getContext()))
                .converter(new JsonConvert())
                .param("from", 0)
                .param("limit", 20)
                .param("order", 1)
                .request(new HttpCallBack<ListBean>() {
                    @Override
                    public void onFailure(Exception e) {
                        LogUtil.d("MainActivity onFailure");
                    }

                    @Override
                    protected void onSuccess(ListBean reposList) {
                        LogUtil.d("MainActivity onSuccess");
                        LogUtil.d("MainActivity onSuccess  size = " + reposList.getData().getGoods().size());

                    }
                });
        addRequest(cancelable);
    }

    @Override
    public void simpleGetRequestForXml() {
        String url = "https://github.com/collections";
        HttpUtils.with(getContext())
                .get()
                .url(url)
                .httpRequest(new RetrofitRequest())
                .request(new HttpCallBack<Response>() {
                    @Override
                    public void onFailure(Exception e) {
                        LogUtil.d("MainActivity onFailure");
                    }

                    @Override
                    protected void onSuccess(Response response) {
                        LogUtil.d("MainActivity onSuccess");
                        try {
                            parsePageData(response.body().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }

    private void parsePageData(String page) {
        Observable.just(page)
                .map(new Function<String, Object>() {

                    @Override
                    public Object apply(String s) {
                        ArrayList<Collection> collections = new ArrayList<>();
                        try {
                            Document doc = Jsoup.parse(s, "https://github.com/");
                            Elements elements = doc.getElementsByClass(
                                    "d-flex border-bottom border-gray-light pb-4 mb-5");
                            for (Element element : elements) {
                                Element titleElement = element.select("div > h2 > a").first();
                                Element descElement = element.select("div").last();
                                String id = titleElement.attr("href");
                                id = id.substring(id.lastIndexOf("/") + 1);
                                String title = titleElement.textNodes().get(0).toString();

                                List<TextNode> descTextNodes = descElement.textNodes();
                                int descIndex = descTextNodes.size() == 0 ? 0 : descTextNodes.size() - 1;
                                String desc = descTextNodes.get(descIndex).toString().trim();
                                Collection collection = new Collection(id, title, desc);
                                collections.add(collection);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return collections;
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Object>() {
                    @Override
                    public void accept(Object results) {
                        if (results != null) {
                            ArrayList<Collection> collections = (ArrayList<Collection>) results;
                            LogUtil.d("collections size = " + collections.size());
                        }
                    }
                });
    }
}
