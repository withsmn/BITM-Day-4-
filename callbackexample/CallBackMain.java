package callbackexample;

import java.io.File;

public class CallBackMain {

	public static void main(String[] args) {
		downloadImage(new OnDownloadProgressListener() {
			
			@Override
			public void onDownloadFinished(File file) {
				System.out.println("Download Completed");
				
			}
		});
		
		
		division(15.0, 25.0, new NumberOperationListener() {
			
			@Override
			public void onSuccess(String msg) {
				System.out.println(msg);
				
			}
			
			@Override
			public void onFailure(String msg) {
				System.out.println(msg);
				
			}
		});
		
	}
	
	public static void downloadImage(OnDownloadProgressListener listener) {
		System.out.println("download started...");
		File file = new File("");
		listener.onDownloadFinished(file);
	}
	
	
	public static void division(double a, double b, NumberOperationListener listener) {
		if(a > b) {
			double result = a / b;
			listener.onSuccess("Operation Successful");
		}else {
			listener.onFailure("Please provide valid input");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
}
