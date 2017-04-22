import java.util.Iterator;

/**
 * Created by a1 on 18.04.17.
 */
public interface VFS {

    boolean isExist(String path);

    boolean isDirectory(String path);

    String getAbsolutePath(String file);

    byte[] getBytes(String file);

    String getUTF8Text(String file);

    Iterator<String> getIterator(String startDir);
}
