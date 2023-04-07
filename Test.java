import android.content.
        res.AssetManager;
import android.content.res.Resources;

public class Test1 {
    public static void testImport(Resources resources) {
        AssetManager assets = resources.getAssets();
        String[] locales = assets.getLocales();
    }
}

public class Test2 {
    public static void testBlock(Resources resources) {
        AssetManager assets = resources.getAssets();
    String[] locales = assets.getLocales();
    }
}

public class Test3 {
    public static void testName(Resources resources) {
        String kName = "123";
        String bname = "a";
        String k_name = "b";
    }
}
