package APITestingRestAssured.stepDefinitions;

public class Posts {


    private String id;
    private String title;
    private String author;

        public String getId() {

            return id;
    }

    public String getTtitle() {

            return  title;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(String id) {

            this.id = id;
    }

    public void setTitle(String title) {

            this.title = title;
    }

    public void setAuthor(String author) {

            this.author = author;
    }
}

