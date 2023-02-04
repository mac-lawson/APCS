/**
 * Author: Mac Lawson
 * Date: 1/6/23
 * Purpose: Hurricane class
 */
public class Hurricane
{
   private String name, month;
   private int year;
   private int cat;
   private int pressure;
   private double windspeed;

     
   
   // Constructor - all private instance variables initialized
   public Hurricane(int y, String n, String m, int c, int p, double w) {
      this.year = y;
      this.name = n;
      this.month = m;
      this.cat = c;
      this.pressure = p;
      this.windspeed = w;
   }

   // Accessor for year
   public int getYear() {
      return year; 
   }

   // Accessor for name
   public String getName() {
      return name; 
   }
   
   // Accessor for month
   public String getMonth() {
      return month;  
   }
   
   // Accessor for category
   public int getCat() {
      return cat;  
   }
   
   // Accessor for pressure
   public int getPressure() {
      return pressure;
   }
   
   // Accessor for wind speed
   public double getWindspeed() {
      return windspeed;
   }
   
   // Mutator for year
   public void setYear(int y) {
      year = y;
   }
   
   // Mutator for name
   public void setName(String n) {
      name = n;
   }
   
   // Mutator for month
   public void setMonth(String m) {
      month = m;
   }
   
   // Mutator for category
   public void setCat(int c) {
      cat = c;
   }
   
   // Mutator for pressure
   public void setPressure(int p) {
      pressure = p;
   }
   
   // Mutator for wind speed
   public void setWindspeed (double w) {
      windspeed = w;
   }

   // Generate a string representation of the Hurricane object
   @Override
   public String toString() {
      return String.format("%4d %22s %22d %22.1f %22d", year, name, cat, windspeed, pressure);
   }
}

