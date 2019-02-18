package interfaces.Impl;

import interfaces.Resource;

import java.io.IOException;
import java.io.InputStream;

public class AbstractResource implements Resource {
    @Override
    public boolean isExists() {
        return false;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return null;
    }
}
