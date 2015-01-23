import com.google.common.base.Function;

import javax.annotation.Nullable;

/**
 * Created by ckale on 10/29/14.
 */
public class DateValueSortFunction implements  Function<PojoDTO, Long>{

    @Nullable
    @Override
    public Long apply(@Nullable final PojoDTO input) {
        return input.getDateTime().getMillis();
    }
}
