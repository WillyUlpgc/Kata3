
package kata3;


public class Kata3 {


    public static void main(String[] args) {
         
        
        Histogram<String> histogram = new Histogram();
        histogram.increment("gmail.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("google.es");
        histogram.increment("google.es");
        histogram.increment("google.es");
        new HistogramDisplay(histogram).execute();
    }
    
}
