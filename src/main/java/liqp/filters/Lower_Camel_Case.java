package liqp.filters;

public class Lower_Camel_Case extends Filter {

    @Override
    public Object apply(Object value, Object... params) {
        return super.asString(value).substring(0, 1).toLowerCase() + super.asString(value).substring(1);
    }
}