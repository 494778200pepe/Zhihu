package com.pepe.zhihu.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author wang
 * @date 2019/7/10.
 */

public class ListBean {

    /**
     * data : {"count":48,"goods":[{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":512,"name":"博洋四件套全棉纯棉欧式夏季被套床单床上用品春夏4件被子床品夏","brandid":63,"intro":"店铺爆款，全棉面料，柔软贴身","image":["http://image.lookbi.com/uploads/goods/1/s_1556864064310597.jpg"],"maxprice":29900,"minprice":26000,"maxoprice":107800,"minoprice":107800,"maxintegral":0,"minintegral":0,"stock":"20","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:14","commission_rate":0.24118738404453,"30minprice":26000,"commission":6270.8719851577},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":513,"name":"博洋家纺床上四件套全棉纯棉夏天北欧床单被套床品三件套床上用品","brandid":63,"intro":"全棉面料，时尚卡通印染","image":["http://image.lookbi.com/uploads/goods/1/s_1556864276860213.jpg"],"maxprice":39900,"minprice":36900,"maxoprice":107800,"minoprice":107800,"maxintegral":0,"minintegral":0,"stock":"20","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-20 21:48:02","commission_rate":0.34230055658627,"30minprice":36900,"commission":12630.890538033},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":514,"name":"Dyson戴森DP04空气净化风扇整屋循环洁净空气无叶台式银白","brandid":70,"intro":"循环洁净空气 定义整屋净化","image":["http://image.lookbi.com/uploads/goods/1/s_1556864594221538.jpg"],"maxprice":349000,"minprice":349000,"maxoprice":349000,"minoprice":349000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:15","commission_rate":0.65,"30minprice":226850,"commission":226850},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":515,"name":"Dyson戴森V7 Trigger+手持式车载除螨吸尘器 多吸头","brandid":70,"intro":"配备车载充电器 家中爱车均适用","image":["http://image.lookbi.com/uploads/goods/1/s_1556864799875145.jpeg"],"maxprice":205000,"minprice":205000,"maxoprice":205000,"minoprice":205000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 19:34:01","commission_rate":0.65,"30minprice":133250,"commission":133250},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":516,"name":"KING BABY翅膀戒指（女）Q20-5220","brandid":68,"intro":"","image":["http://image.lookbi.com/uploads/goods/1/s_1556864996723118.jpg"],"maxprice":469000,"minprice":469000,"maxoprice":469000,"minoprice":469000,"maxintegral":0,"minintegral":0,"stock":"30","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:15","commission_rate":0.65,"30minprice":304850,"commission":304850},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":517,"name":"KING BABY大号石榴石眼珠\u201cCHOSEN\u201d字样骷髅戒指K20-5304","brandid":68,"intro":"经典系列","image":["http://image.lookbi.com/uploads/goods/1/s_1556865129308854.jpg"],"maxprice":1619000,"minprice":1619000,"maxoprice":1619000,"minoprice":1619000,"maxintegral":0,"minintegral":0,"stock":"30","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:15","commission_rate":0.65,"30minprice":1052350,"commission":1052350},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":518,"name":"九阳Onecup小黄人胶囊咖啡机家用小型全自动豆浆奶茶机KD08-K1Y","brandid":55,"intro":"神偷奶爸小黄人限定款","image":["http://image.lookbi.com/uploads/goods/1/s_1556865466515932.jpg"],"maxprice":129900,"minprice":129900,"maxoprice":159900,"minoprice":159900,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:15","commission_rate":0.46238273921201,"30minprice":73935,"commission":60063.51782364},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":519,"name":"九阳onecup全自动胶囊咖啡机咖啡豆浆奶茶 KD12-K6","brandid":55,"intro":"经典旗舰店款 满足全家人口味","image":["http://image.lookbi.com/uploads/goods/1/s_1556865666556296.jpg"],"maxprice":199900,"minprice":199900,"maxoprice":239900,"minoprice":239900,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-21 11:44:03","commission_rate":0.48326385994164,"30minprice":115935,"commission":96604.445602334},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":520,"name":"新秀丽时尚炫彩背包96Q*61001","brandid":72,"intro":"新秀丽时尚炫彩背包","image":["http://image.lookbi.com/uploads/goods/1/s_1556866044798450.jpg"],"maxprice":78000,"minprice":78000,"maxoprice":78000,"minoprice":78000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:15","commission_rate":0.65,"30minprice":50700,"commission":50700},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":521,"name":"新秀丽四轮拉杆箱红色I74款","brandid":72,"intro":"新秀丽四轮拉杆箱红色","image":["http://image.lookbi.com/uploads/goods/1/s_1558351878794701.png"],"maxprice":368000,"minprice":328000,"maxoprice":368000,"minoprice":328000,"maxintegral":0,"minintegral":0,"stock":"40","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-20 19:31:24","commission_rate":0.54130434782609,"30minprice":199200,"commission":177547.82608696},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":522,"name":"万事利新品丝巾礼品龙井丝韵·珍享版 ","brandid":24,"intro":"双面印花大方巾-心锁臻爱","image":["http://image.lookbi.com/uploads/goods/1/s_1557382429889384.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382432579513.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382437871783.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382447496645.jpg"],"maxprice":84900,"minprice":84900,"maxoprice":99600,"minoprice":99600,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-17 21:39:07","commission_rate":0.50240963855422,"30minprice":50040,"commission":42654.578313253},{"shopid":1,"shopname":"嘉兴忙族","shopcity":"杭州市","shopimage":"","goodsid":523,"name":"万事利新品文化创意礼品丝绸团扇手账书签","brandid":24,"intro":"行运万事利礼盒 顺旺发","image":["http://image.lookbi.com/uploads/goods/1/s_1557382727203715.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382732567205.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382735516208.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382739388531.jpg"],"maxprice":19900,"minprice":19900,"maxoprice":26800,"minoprice":26800,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-17 21:39:11","commission_rate":0.39253731343284,"30minprice":10520,"commission":7811.4925373134},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":525,"name":"宠尚凉席冰丝席子单双人夏季空调席可折叠","brandid":63,"intro":"宠尚凉席冰丝席子单双人夏季空调席可折叠","image":["http://image.lookbi.com/uploads/goods/1/s_1557374540937766.jpg","http://image.lookbi.com/uploads/goods/1/s_1557374544351996.jpg","http://image.lookbi.com/uploads/goods/1/s_1557374547425394.jpg","http://image.lookbi.com/uploads/goods/1/s_1557374551841713.jpg"],"maxprice":39800,"minprice":39800,"maxoprice":40800,"minoprice":40800,"maxintegral":0,"minintegral":0,"stock":"400","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-09 12:04:32","commission_rate":0.62549019607843,"30minprice":25520,"commission":24894.509803922},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":529,"name":"小清新小熊伞黑胶遮阳防晒晴雨伞两用三折叠创意卡通自动伞太阳伞","brandid":73,"intro":"","image":["http://image.lookbi.com/uploads/goods/1/s_1558370261485885.jpg"],"maxprice":6500,"minprice":6500,"maxoprice":9900,"minoprice":9900,"maxintegral":0,"minintegral":0,"stock":"4000","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-21 00:37:46","commission_rate":0.30656565656566,"30minprice":3035,"commission":1992.6767676768},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":533,"name":"KING BABY翅膀雕刻开口戒指 K20-5962","brandid":68,"intro":"心灵蜕变系列","image":["http://image.lookbi.com/uploads/goods/1/s_1558174436109455.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174482968965.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174485989809.jpg"],"maxprice":259000,"minprice":259000,"maxoprice":259000,"minoprice":259000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 18:26:30","commission_rate":0.65,"30minprice":168350,"commission":168350},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":534,"name":"KING BABY皇冠戒指 Q20-5002","brandid":68,"intro":"经典系列","image":["http://image.lookbi.com/uploads/goods/1/s_1558174652297295.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174655730741.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174658488965.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174661349998.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174664330855.jpg"],"maxprice":499000,"minprice":499000,"maxoprice":499000,"minoprice":499000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 18:25:46","commission_rate":0.65,"30minprice":324350,"commission":324350},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":535,"name":"KING BABY哥特式十字架戒指 K20-5004","brandid":68,"intro":"经典系列","image":["http://image.lookbi.com/uploads/goods/1/s_1558174806867140.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174808870759.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174811703531.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174815152564.jpg"],"maxprice":519000,"minprice":519000,"maxoprice":519000,"minoprice":519000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 18:25:35","commission_rate":0.65,"30minprice":337350,"commission":337350},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":536,"name":"KING BABY黑玛瑙镶嵌哥特十字架戒指 K20-9004P","brandid":68,"intro":"经典系列","image":["http://image.lookbi.com/uploads/goods/1/s_1558174956396598.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174959767997.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174962667333.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174969914251.jpg"],"maxprice":529000,"minprice":529000,"maxoprice":529000,"minoprice":529000,"maxintegral":0,"minintegral":0,"stock":"2","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-27 10:08:15","commission_rate":0.65,"30minprice":343850,"commission":343850},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":537,"name":"Samsonite/新秀丽商务背包时尚休闲双肩包大容量电脑包新款 36B08","brandid":72,"intro":"大容装载 商务出行","image":["http://image.lookbi.com/uploads/goods/1/s_1558177420250630.jpg","http://image.lookbi.com/uploads/goods/1/s_1558177424111978.jpg","http://image.lookbi.com/uploads/goods/1/s_1558177427984747.jpg"],"maxprice":44900,"minprice":44900,"maxoprice":45000,"minoprice":45000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 19:32:22","commission_rate":0.64777777777778,"30minprice":29150,"commission":29085.222222222},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":538,"name":"Samsonite/新秀丽时尚休闲双肩包大容量都市男女背包大中号 BT5","brandid":72,"intro":"CP款 开口便捷设计","image":["http://image.lookbi.com/uploads/goods/1/s_1558177679498140.jpg","http://image.lookbi.com/uploads/goods/1/s_1558177682658847.jpg","http://image.lookbi.com/uploads/goods/1/s_1558177686332648.jpg"],"maxprice":54600,"minprice":54600,"maxoprice":78000,"minoprice":78000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 19:32:08","commission_rate":0.35,"30minprice":27300,"commission":19110}]}
     * error :
     * status : 1
     */

    private DataBean data;
    private String error;
    private int status;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * count : 48
         * goods : [{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":512,"name":"博洋四件套全棉纯棉欧式夏季被套床单床上用品春夏4件被子床品夏","brandid":63,"intro":"店铺爆款，全棉面料，柔软贴身","image":["http://image.lookbi.com/uploads/goods/1/s_1556864064310597.jpg"],"maxprice":29900,"minprice":26000,"maxoprice":107800,"minoprice":107800,"maxintegral":0,"minintegral":0,"stock":"20","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:14","commission_rate":0.24118738404453,"30minprice":26000,"commission":6270.8719851577},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":513,"name":"博洋家纺床上四件套全棉纯棉夏天北欧床单被套床品三件套床上用品","brandid":63,"intro":"全棉面料，时尚卡通印染","image":["http://image.lookbi.com/uploads/goods/1/s_1556864276860213.jpg"],"maxprice":39900,"minprice":36900,"maxoprice":107800,"minoprice":107800,"maxintegral":0,"minintegral":0,"stock":"20","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-20 21:48:02","commission_rate":0.34230055658627,"30minprice":36900,"commission":12630.890538033},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":514,"name":"Dyson戴森DP04空气净化风扇整屋循环洁净空气无叶台式银白","brandid":70,"intro":"循环洁净空气 定义整屋净化","image":["http://image.lookbi.com/uploads/goods/1/s_1556864594221538.jpg"],"maxprice":349000,"minprice":349000,"maxoprice":349000,"minoprice":349000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:15","commission_rate":0.65,"30minprice":226850,"commission":226850},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":515,"name":"Dyson戴森V7 Trigger+手持式车载除螨吸尘器 多吸头","brandid":70,"intro":"配备车载充电器 家中爱车均适用","image":["http://image.lookbi.com/uploads/goods/1/s_1556864799875145.jpeg"],"maxprice":205000,"minprice":205000,"maxoprice":205000,"minoprice":205000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 19:34:01","commission_rate":0.65,"30minprice":133250,"commission":133250},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":516,"name":"KING BABY翅膀戒指（女）Q20-5220","brandid":68,"intro":"","image":["http://image.lookbi.com/uploads/goods/1/s_1556864996723118.jpg"],"maxprice":469000,"minprice":469000,"maxoprice":469000,"minoprice":469000,"maxintegral":0,"minintegral":0,"stock":"30","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:15","commission_rate":0.65,"30minprice":304850,"commission":304850},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":517,"name":"KING BABY大号石榴石眼珠\u201cCHOSEN\u201d字样骷髅戒指K20-5304","brandid":68,"intro":"经典系列","image":["http://image.lookbi.com/uploads/goods/1/s_1556865129308854.jpg"],"maxprice":1619000,"minprice":1619000,"maxoprice":1619000,"minoprice":1619000,"maxintegral":0,"minintegral":0,"stock":"30","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:15","commission_rate":0.65,"30minprice":1052350,"commission":1052350},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":518,"name":"九阳Onecup小黄人胶囊咖啡机家用小型全自动豆浆奶茶机KD08-K1Y","brandid":55,"intro":"神偷奶爸小黄人限定款","image":["http://image.lookbi.com/uploads/goods/1/s_1556865466515932.jpg"],"maxprice":129900,"minprice":129900,"maxoprice":159900,"minoprice":159900,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:15","commission_rate":0.46238273921201,"30minprice":73935,"commission":60063.51782364},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":519,"name":"九阳onecup全自动胶囊咖啡机咖啡豆浆奶茶 KD12-K6","brandid":55,"intro":"经典旗舰店款 满足全家人口味","image":["http://image.lookbi.com/uploads/goods/1/s_1556865666556296.jpg"],"maxprice":199900,"minprice":199900,"maxoprice":239900,"minoprice":239900,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-21 11:44:03","commission_rate":0.48326385994164,"30minprice":115935,"commission":96604.445602334},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":520,"name":"新秀丽时尚炫彩背包96Q*61001","brandid":72,"intro":"新秀丽时尚炫彩背包","image":["http://image.lookbi.com/uploads/goods/1/s_1556866044798450.jpg"],"maxprice":78000,"minprice":78000,"maxoprice":78000,"minoprice":78000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-07 09:47:15","commission_rate":0.65,"30minprice":50700,"commission":50700},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":521,"name":"新秀丽四轮拉杆箱红色I74款","brandid":72,"intro":"新秀丽四轮拉杆箱红色","image":["http://image.lookbi.com/uploads/goods/1/s_1558351878794701.png"],"maxprice":368000,"minprice":328000,"maxoprice":368000,"minoprice":328000,"maxintegral":0,"minintegral":0,"stock":"40","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-20 19:31:24","commission_rate":0.54130434782609,"30minprice":199200,"commission":177547.82608696},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":522,"name":"万事利新品丝巾礼品龙井丝韵·珍享版 ","brandid":24,"intro":"双面印花大方巾-心锁臻爱","image":["http://image.lookbi.com/uploads/goods/1/s_1557382429889384.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382432579513.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382437871783.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382447496645.jpg"],"maxprice":84900,"minprice":84900,"maxoprice":99600,"minoprice":99600,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-17 21:39:07","commission_rate":0.50240963855422,"30minprice":50040,"commission":42654.578313253},{"shopid":1,"shopname":"嘉兴忙族","shopcity":"杭州市","shopimage":"","goodsid":523,"name":"万事利新品文化创意礼品丝绸团扇手账书签","brandid":24,"intro":"行运万事利礼盒 顺旺发","image":["http://image.lookbi.com/uploads/goods/1/s_1557382727203715.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382732567205.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382735516208.jpg","http://image.lookbi.com/uploads/goods/1/s_1557382739388531.jpg"],"maxprice":19900,"minprice":19900,"maxoprice":26800,"minoprice":26800,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-17 21:39:11","commission_rate":0.39253731343284,"30minprice":10520,"commission":7811.4925373134},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":525,"name":"宠尚凉席冰丝席子单双人夏季空调席可折叠","brandid":63,"intro":"宠尚凉席冰丝席子单双人夏季空调席可折叠","image":["http://image.lookbi.com/uploads/goods/1/s_1557374540937766.jpg","http://image.lookbi.com/uploads/goods/1/s_1557374544351996.jpg","http://image.lookbi.com/uploads/goods/1/s_1557374547425394.jpg","http://image.lookbi.com/uploads/goods/1/s_1557374551841713.jpg"],"maxprice":39800,"minprice":39800,"maxoprice":40800,"minoprice":40800,"maxintegral":0,"minintegral":0,"stock":"400","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-09 12:04:32","commission_rate":0.62549019607843,"30minprice":25520,"commission":24894.509803922},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":529,"name":"小清新小熊伞黑胶遮阳防晒晴雨伞两用三折叠创意卡通自动伞太阳伞","brandid":73,"intro":"","image":["http://image.lookbi.com/uploads/goods/1/s_1558370261485885.jpg"],"maxprice":6500,"minprice":6500,"maxoprice":9900,"minoprice":9900,"maxintegral":0,"minintegral":0,"stock":"4000","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-21 00:37:46","commission_rate":0.30656565656566,"30minprice":3035,"commission":1992.6767676768},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":533,"name":"KING BABY翅膀雕刻开口戒指 K20-5962","brandid":68,"intro":"心灵蜕变系列","image":["http://image.lookbi.com/uploads/goods/1/s_1558174436109455.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174482968965.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174485989809.jpg"],"maxprice":259000,"minprice":259000,"maxoprice":259000,"minoprice":259000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 18:26:30","commission_rate":0.65,"30minprice":168350,"commission":168350},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":534,"name":"KING BABY皇冠戒指 Q20-5002","brandid":68,"intro":"经典系列","image":["http://image.lookbi.com/uploads/goods/1/s_1558174652297295.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174655730741.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174658488965.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174661349998.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174664330855.jpg"],"maxprice":499000,"minprice":499000,"maxoprice":499000,"minoprice":499000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 18:25:46","commission_rate":0.65,"30minprice":324350,"commission":324350},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":535,"name":"KING BABY哥特式十字架戒指 K20-5004","brandid":68,"intro":"经典系列","image":["http://image.lookbi.com/uploads/goods/1/s_1558174806867140.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174808870759.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174811703531.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174815152564.jpg"],"maxprice":519000,"minprice":519000,"maxoprice":519000,"minoprice":519000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 18:25:35","commission_rate":0.65,"30minprice":337350,"commission":337350},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":536,"name":"KING BABY黑玛瑙镶嵌哥特十字架戒指 K20-9004P","brandid":68,"intro":"经典系列","image":["http://image.lookbi.com/uploads/goods/1/s_1558174956396598.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174959767997.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174962667333.jpg","http://image.lookbi.com/uploads/goods/1/s_1558174969914251.jpg"],"maxprice":529000,"minprice":529000,"maxoprice":529000,"minoprice":529000,"maxintegral":0,"minintegral":0,"stock":"2","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-27 10:08:15","commission_rate":0.65,"30minprice":343850,"commission":343850},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":537,"name":"Samsonite/新秀丽商务背包时尚休闲双肩包大容量电脑包新款 36B08","brandid":72,"intro":"大容装载 商务出行","image":["http://image.lookbi.com/uploads/goods/1/s_1558177420250630.jpg","http://image.lookbi.com/uploads/goods/1/s_1558177424111978.jpg","http://image.lookbi.com/uploads/goods/1/s_1558177427984747.jpg"],"maxprice":44900,"minprice":44900,"maxoprice":45000,"minoprice":45000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 19:32:22","commission_rate":0.64777777777778,"30minprice":29150,"commission":29085.222222222},{"shopid":0,"shopname":null,"shopcity":null,"shopimage":"","goodsid":538,"name":"Samsonite/新秀丽时尚休闲双肩包大容量都市男女背包大中号 BT5","brandid":72,"intro":"CP款 开口便捷设计","image":["http://image.lookbi.com/uploads/goods/1/s_1558177679498140.jpg","http://image.lookbi.com/uploads/goods/1/s_1558177682658847.jpg","http://image.lookbi.com/uploads/goods/1/s_1558177686332648.jpg"],"maxprice":54600,"minprice":54600,"maxoprice":78000,"minoprice":78000,"maxintegral":0,"minintegral":0,"stock":"10","collectioncount":0,"sales":0,"hits":0,"createtime":"2019-05-18 19:32:08","commission_rate":0.35,"30minprice":27300,"commission":19110}]
         */

        private int count;
        private List<GoodsBean> goods;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<GoodsBean> getGoods() {
            return goods;
        }

        public void setGoods(List<GoodsBean> goods) {
            this.goods = goods;
        }

        public static class GoodsBean {
            /**
             * shopid : 0
             * shopname : null
             * shopcity : null
             * shopimage :
             * goodsid : 512
             * name : 博洋四件套全棉纯棉欧式夏季被套床单床上用品春夏4件被子床品夏
             * brandid : 63
             * intro : 店铺爆款，全棉面料，柔软贴身
             * image : ["http://image.lookbi.com/uploads/goods/1/s_1556864064310597.jpg"]
             * maxprice : 29900
             * minprice : 26000
             * maxoprice : 107800
             * minoprice : 107800
             * maxintegral : 0
             * minintegral : 0
             * stock : 20
             * collectioncount : 0
             * sales : 0
             * hits : 0
             * createtime : 2019-05-07 09:47:14
             * commission_rate : 0.24118738404453
             * 30minprice : 26000
             * commission : 6270.8719851577
             */

            private int shopid;
            private Object shopname;
            private Object shopcity;
            private String shopimage;
            private int goodsid;
            private String name;
            private int brandid;
            private String intro;
            private int maxprice;
            private int minprice;
            private int maxoprice;
            private int minoprice;
            private int maxintegral;
            private int minintegral;
            private String stock;
            private int collectioncount;
            private int sales;
            private int hits;
            private String createtime;
            private double commission_rate;
            @SerializedName("30minprice")
            private int _$30minprice;
            private double commission;
            private List<String> image;

            public int getShopid() {
                return shopid;
            }

            public void setShopid(int shopid) {
                this.shopid = shopid;
            }

            public Object getShopname() {
                return shopname;
            }

            public void setShopname(Object shopname) {
                this.shopname = shopname;
            }

            public Object getShopcity() {
                return shopcity;
            }

            public void setShopcity(Object shopcity) {
                this.shopcity = shopcity;
            }

            public String getShopimage() {
                return shopimage;
            }

            public void setShopimage(String shopimage) {
                this.shopimage = shopimage;
            }

            public int getGoodsid() {
                return goodsid;
            }

            public void setGoodsid(int goodsid) {
                this.goodsid = goodsid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getBrandid() {
                return brandid;
            }

            public void setBrandid(int brandid) {
                this.brandid = brandid;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public int getMaxprice() {
                return maxprice;
            }

            public void setMaxprice(int maxprice) {
                this.maxprice = maxprice;
            }

            public int getMinprice() {
                return minprice;
            }

            public void setMinprice(int minprice) {
                this.minprice = minprice;
            }

            public int getMaxoprice() {
                return maxoprice;
            }

            public void setMaxoprice(int maxoprice) {
                this.maxoprice = maxoprice;
            }

            public int getMinoprice() {
                return minoprice;
            }

            public void setMinoprice(int minoprice) {
                this.minoprice = minoprice;
            }

            public int getMaxintegral() {
                return maxintegral;
            }

            public void setMaxintegral(int maxintegral) {
                this.maxintegral = maxintegral;
            }

            public int getMinintegral() {
                return minintegral;
            }

            public void setMinintegral(int minintegral) {
                this.minintegral = minintegral;
            }

            public String getStock() {
                return stock;
            }

            public void setStock(String stock) {
                this.stock = stock;
            }

            public int getCollectioncount() {
                return collectioncount;
            }

            public void setCollectioncount(int collectioncount) {
                this.collectioncount = collectioncount;
            }

            public int getSales() {
                return sales;
            }

            public void setSales(int sales) {
                this.sales = sales;
            }

            public int getHits() {
                return hits;
            }

            public void setHits(int hits) {
                this.hits = hits;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public double getCommission_rate() {
                return commission_rate;
            }

            public void setCommission_rate(double commission_rate) {
                this.commission_rate = commission_rate;
            }

            public int get_$30minprice() {
                return _$30minprice;
            }

            public void set_$30minprice(int _$30minprice) {
                this._$30minprice = _$30minprice;
            }

            public double getCommission() {
                return commission;
            }

            public void setCommission(double commission) {
                this.commission = commission;
            }

            public List<String> getImage() {
                return image;
            }

            public void setImage(List<String> image) {
                this.image = image;
            }
        }
    }
}
