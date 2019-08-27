

package com.pepe.zhihu.inject.component;




import com.pepe.zhihu.AppApplication;
import com.pepe.zhihu.inject.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    /**
     * 获取AppApplication
     * @return
     */
    AppApplication getApplication();

}
