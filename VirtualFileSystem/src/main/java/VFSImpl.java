import java.util.Iterator;

/**
 * Created by a1 on 18.04.17.
 */
public class VFSImpl implements VFS {
    private String root;

    public VFSImpl(String root) {
        this.root = root;
    }

    @Override
    public boolean isExist(String path) {
        return false;
    }

    @Override
    public boolean isDirectory(String path) {
        return false;
    }

    @Override
    public String getAbsolutePath(String file) {
        return null;
    }

    @Override
    public byte[] getBytes(String file) {
        return new byte[0];
    }

    @Override
    public String getUTF8Text(String file) {
        return null;
    }

    @Override
    public Iterator<String> getIterator(String startDir) {
        return null;
    }
}
