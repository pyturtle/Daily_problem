// The actual code for creating an Array to hold DVD's.

// A simple definition for a DVD.
public class DVD {
    public String name;
    public int releaseYear;
    public String director;
    
    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }
    
    @Override
    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }


    public static void main(String[] args) {
        // Create an array of DVD's.
        DVD[] dvdCollection = new DVD[15];
    }
}