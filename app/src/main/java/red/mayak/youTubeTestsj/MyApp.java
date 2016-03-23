package red.mayak.youTubeTestsj;

import android.app.Application;

/**
 * Created by kirillvarlamov on 23.03.16.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // trust all SSL -> HTTPS connection
        SSLCertificateHandler.nuke();
    }
}
