import java.lang.reflect.Array;
import java.util.*;
public class EnoughIsEnough {

  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    //Code here ;)
    if (maxOccurrences==0) return new int[0];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<elements.length;i++)
            arrayList.add(elements[i]);
        for(int i = 0; i < arrayList.size(); i++)
        {
            int counter=1;
            for(int j = i+1; j < arrayList.size();j++)
            {
                if(arrayList.get(i)==arrayList.get(j)) counter++;
            }
            if (counter>maxOccurrences)
            {
                while (counter!=maxOccurrences)
                {
                    arrayList.remove(arrayList.lastIndexOf(arrayList.get(i)));
                    counter--;
                }
            }
        }
        int[] new_elements=new int[arrayList.size()];
        for(int i = 0; i<arrayList.size(); i++)
        {
            new_elements[i] = arrayList.get(i);
        }
        return new_elements;
  }

}
