# This is a configuration file for ProGuard.
# http://proguard.sourceforge.net/index.html#manual/usage.html

-dontusemixedcaseclassnames

# For native methods, see http://proguard.sourceforge.net/manual/examples.html#native
-keepclasseswithmembernames class * {
    native <methods>;
}

# keep setters in Views so that animations can still work.
# see http://proguard.sourceforge.net/manual/examples.html#animations
-keepclassmembers public class * extends android.view.View {
   void set*(***);*** get*();
}

-keepclassmembers class * extends android.app.Activity {
   public void *(android.view.View);
}

# Preserve line numbers for easier debugging
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile
