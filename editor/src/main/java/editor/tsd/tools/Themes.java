package editor.tsd.tools;

import java.util.ArrayList;

public class Themes {
  public interface ThemeSet {
    public ArrayList<String> getThemes();
  }

  public class AceEditorTheme implements ThemeSet {
    public class Dark implements ThemeSet {
      @Deprecated public static final String Dracula = "Dracula";
      public static final String Monokai = "Monokai";
      public static final String Default = Monokai;

      public ArrayList<String> getThemes() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add(Dracula);
        arr.add(Monokai);
        return arr;
      }
    }

    public class Light implements ThemeSet {
      public static final String Chrome = "Chrome";
      public static final String Clouds = "Clouds";
      public static final String Crimeson_Editor = "Crimeson_Editor";
      public static final String Dawn = "Dawn";
      public static final String Default = Chrome;

      public ArrayList<String> getThemes() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add(Chrome);
        arr.add(Clouds);
        arr.add(Crimeson_Editor);
        arr.add(Dawn);
        return arr;
      }
    }

    @Override
    public ArrayList<String> getThemes() {
      ArrayList<String> arr = new ArrayList<String>();
      arr.addAll(new Light().getThemes());
      arr.addAll(new Dark().getThemes());
      ArrayList<String> darkThemes = new Dark().getThemes();
      return arr;
    }
  }

  public class SoraEditorTheme implements ThemeSet {
    public class Dark implements ThemeSet {
      @Deprecated public static final String Darcula = "Darcula";
      public static final String Monokai = "Monokai";
      public static final String Solarized_Drak = "Solarized_Drak";
      public static final String Default = Monokai;

      @Override
      public ArrayList<String> getThemes() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add(Darcula);
        arr.add(Monokai);
        arr.add(Solarized_Drak);
        return arr;
      }
    }

    public class Light implements ThemeSet {
      public static final String Quietlight = "Quietlight";
      public static final String Solarized_Light = "Solarized_Light";
      public static final String Default = Quietlight;

      @Override
      public ArrayList<String> getThemes() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add(Quietlight);
        arr.add(Solarized_Light);
        return arr;
      }
    }

    @Override
    public ArrayList<String> getThemes() {
      ArrayList<String> arr = new ArrayList<String>();
      arr.addAll(new Light().getThemes());
      arr.addAll(new Dark().getThemes());
      return arr;
    }
  }
}
