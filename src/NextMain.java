public class NextMain {
    public static void main(String[] args) {
        Movie movie  =  Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Movie movieAdventure  = (Adventure) Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        var comedy = Movie.getMovie("C", "Airplane");
        comedy.watchMovie();

        Object unknownObject = Movie.getMovie("C","Airplane");
        if(unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        }

        if(unknownObject instanceof Adventure adventure){
            adventure.watchAdventure();
        }
    }
}
