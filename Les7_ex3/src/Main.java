import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Таблицы для хранения рейтингов фильмов и фильмографии актёров
        HashMap<Actor, ArrayList<Movie>> filmography = new HashMap<>();
        HashMap<Movie, Double> ratings = new HashMap<>();

        Movie ivanVasilievichMovie = new Movie("Иван Васильевич меняет профессию", 1973);
        Movie gentlemenOfFortuneMovie = new Movie("Джентльмены удачи", 1971);
        Movie operationYMovie = new Movie("Операция «Ы» и другие приключения Шурика", 1965);
        ratings.put(ivanVasilievichMovie, 8.6);
        ratings.put(gentlemenOfFortuneMovie, 8.5);
        ratings.put(operationYMovie, 8.7);

        Actor aDemyanenko = new Actor("Александр", "Демьяненко");

        ArrayList<Movie> actorMovies = new ArrayList<>();
        actorMovies.add(ivanVasilievichMovie);
        actorMovies.add(operationYMovie);

        filmography.put(aDemyanenko, actorMovies);

        if (filmography.containsKey(new Actor("Александр", "Демьяненко"))) {
            ArrayList<Movie> foundMovies = filmography.get(new Actor("Александр", "Демьяненко"));
            System.out.println("В фильмографии актёра А. Демьяненко найдены следующие фильмы: ");
            for (Movie movie : foundMovies) {
                if (ratings.containsKey(new Movie(movie.title, movie.releaseYear))) {
                    double rating = ratings.get(movie);
                    System.out.println("Фильм " + movie.description() + " с рейтингом " + rating);
                } else {
                    System.out.println("Что-то пошло не так... Проверьте реализацию equals и hashCode в классе Movie.");
                }
            }
        } else {
            System.out.println("Что-то пошло не так... Проверьте реализацию equals и hashCode в классе Actor.");
        }
    }
}

class Actor {
    String firstName;
    String lastName;

    public Actor(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || getClass() != obj.getClass())
            return false;
        if(obj == this)
            return true;
        Actor actor = (Actor) obj;
        if (! Objects.equals(actor.firstName,firstName))
            return false;
        if (! Objects.equals(actor.lastName, lastName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        if (firstName != null)
            hash = 17 * Objects.hash(firstName);
        if (lastName !=null)
            hash += 17*Objects.hash(lastName);
        return hash;
    }
}

class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны

    public Movie(String title,int releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Movie movie = (Movie) obj;
        if (! Objects.equals(movie.title,title))
            return false;
        if (! Objects.equals(movie.releaseYear,releaseYear))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        if( title != null)
            hash = 17*title.hashCode();
        if (releaseYear != 0)
            hash+=17*releaseYear;
        return hash;
    }

    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }
}
