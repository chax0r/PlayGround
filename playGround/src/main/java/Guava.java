import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ckale on 10/29/14.
 */
public class Guava {

    public static void main(String[] args) {

        List<PojoDTO> dtoList = createListOfPojos();

        List<PojoDTO> sorted = Ordering.natural().reverse().onResultOf( new DateValueSortFunction()).sortedCopy(dtoList);

        for(PojoDTO dto: sorted){
            System.out.println(dto.getDateTime() + ":" + dto.getSomething());
        }

     //   Ordering<PojoDTO> primary = Ordering.natural().onResultOf(stringValueSortFunction);

    }

    static List<PojoDTO> createListOfPojos(){
        DateTimeFormatter dtf = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");

        List<PojoDTO>dtoList = new ArrayList<PojoDTO>();

        dtoList.add(new PojoDTO(dtf.parseDateTime("08/13/2014 08:08:57"), "some1"));
        dtoList.add(new PojoDTO(dtf.parseDateTime("08/13/2014 08:08:50"), "some2"));
        dtoList.add(new PojoDTO(dtf.parseDateTime("08/13/2013 08:08:59"), "some3"));
        dtoList.add(new PojoDTO(dtf.parseDateTime("08/13/2015 08:09:00"), "some4"));
        dtoList.add(new PojoDTO(dtf.parseDateTime("08/13/1984 10:20:00"), "some5"));
        return dtoList;
    }


}
