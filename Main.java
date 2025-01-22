import java.util.ArrayList;

public class Lists
{
  private ArrayList<String> current;
  private ArrayList<String> old;

  public Lists(String[] start)
  {
    current = new ArrayList<String>();
    old = new ArrayList<String>();
    for(String word : start)
         current.add(word); 
  }

  public void replace(int index, String str)
  {
    //Type in code for part A here
  }

  public String archive(int index)
  {
    //Type in code for part B here.  Remove the null return
    return null;
  }

  public String toString()
  {
    String output = "Current: " + current;
    output += "\nOld: " + old;
    return output;
  }
  
}