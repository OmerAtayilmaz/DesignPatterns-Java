package builderreview;

public class User {
    private Long id;
    private String name;
    private String password;

    public User(){

    }
    public User(UserBuilder userBuilder){
        this.id=userBuilder.id;
        this.name=userBuilder.name;
        this.password=userBuilder.password;
    }
    
    @Override
    public String toString() {
        return "id: "+id+ " name:"+name+" pass:"+password;
    }

    public static class UserBuilder{
        private Long id;
        private String name;
        private String password;

        public UserBuilder id(Long id){
            this.id=id;
            return this;
        }
        public UserBuilder name(String name){
            this.name=name;
            return this;
        }
        public UserBuilder password(String password){
            this.password=password;
            return this;
        }
        public User build(){
            User u=new User(this);
            return u;
        }
    }
}
