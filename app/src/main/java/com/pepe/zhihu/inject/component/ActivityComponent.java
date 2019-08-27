

package com.pepe.zhihu.inject.component;



import com.pepe.zhihu.MainActivity;
import com.pepe.zhihu.inject.ActivityScope;
import com.pepe.zhihu.inject.module.ActivityModule;

import dagger.Component;

@ActivityScope
@Component(modules = ActivityModule.class, dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
//    void inject(SplashActivity activity);
//    void inject(LoginActivity activity);
//    void inject(SettingsActivity activity);
//    void inject(RepositoryActivity activity);
//    void inject(ProfileActivity activity);
//    void inject(SearchActivity activity);
//    void inject(ReleaseInfoActivity activity);
//    void inject(IssuesActivity activity);
//    void inject(IssueDetailActivity activity);
//    void inject(EditIssueActivity activity);
//    void inject(CommitDetailActivity activity);
//    void inject(TrendingActivity activity);
}
