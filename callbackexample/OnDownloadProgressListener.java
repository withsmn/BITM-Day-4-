package callbackexample;

import java.io.File;

public interface OnDownloadProgressListener {
	void onDownloadFinished(File imageFile);
}
