/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
      Measurable[] countries = new Measurable[5];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      countries[3] = new Country("Ghana", 679360);
      countries[4] = new Country("Spain", 837270);

      Measurable maxCountry = Data.max(countries);
      System.out.println("Maximum area: " + maxCountry.getMeasure());
      System.out.println("Expected: 837270");
   }
}
