package labotory.lab5.Store;

public class WebStore extends Store {
    private String internetAddress;
    private String programmingLanguage;

    public WebStore(String name, String internetAddress, String programmingLanguage) {
        super(name);
        this.internetAddress = internetAddress;
        this.programmingLanguage = programmingLanguage;
    }

    public String getInternetAddress() {
        return internetAddress;
    }

    public void setInternetAddress(String internetAddress) {
        this.internetAddress = internetAddress;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Description" + getName() +
                "\nInternet address: " + internetAddress +
                "\nProgramming language: " + programmingLanguage;
    }
}
