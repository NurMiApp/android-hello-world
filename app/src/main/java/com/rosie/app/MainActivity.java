public class Post {
          public String uid;
          public String author;
          public String body;
          public String imageUrl;
          public int starCount = 0;
          public Map<String, Boolean> stars = new HashMap<>();

          public Post() {
              // Default constructor required for calls to DataSnapshot.getValue(Post.class)
          }

          public Post(String uid, String author, String body, String imageUrl) {
              this.uid = uid;
              this.author = author;
              this.body = body;
              this.imageUrl = imageUrl;
          }
      }
}