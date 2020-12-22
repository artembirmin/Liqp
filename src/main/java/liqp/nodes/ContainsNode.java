package liqp.nodes;

import liqp.LValue;
import liqp.TemplateContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainsNode extends LValue implements LNode {

    private LNode lhs;
    private LNode rhs;

    public ContainsNode(LNode lhs, LNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Object render(TemplateContext context) {

        Object collection = lhs.render(context);
        Object needle = rhs.render(context);

        if(super.isArray(collection)) {
            Object[] array = super.asArray(collection);
            List<Object> finalCollection = toSingleNumberType(Arrays.asList(array));
            needle = toSingleNumberType(needle);
            return finalCollection.contains(needle);
        }

        if(super.isString(collection)) {
            return super.asString(collection).contains(super.asString(needle));
        }

        return false;
    }

    private Object toSingleNumberType(Object needle) {
        if (needle instanceof Number) {
            needle = new BigDecimal(needle.toString()).stripTrailingZeros();
        }
        return needle;
    }

    private List<Object> toSingleNumberType(List<Object> asList) {
        ArrayList<Object> res = new ArrayList<>(asList.size());
        for(Object item: asList) {
            if (item instanceof Number) {
                res.add(new BigDecimal(item.toString()).stripTrailingZeros());
            } else {
                res.add(item);
            }
        }
        return res;
    }
}
