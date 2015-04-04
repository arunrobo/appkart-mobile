package info.androidhive.tabsswipe;

public class NewsItem {

	private String appName;
	private String publisherName;
	private String date;


	public String getHeadline() {
		return appName;
	}

	public void setHeadline(String appName) {
		this.appName = appName;
	}

	public String getReporterName() {
		return publisherName;
	}

	public void setReporterName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
        return "[ headline=" + appName + ", reporter Name=" +
                publisherName + " , date=" + date + "]";
	}
}
