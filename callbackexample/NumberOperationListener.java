package callbackexample;

public interface NumberOperationListener {
	void onSuccess(String msg);
	void onFailure(String msg);
}
