package cucumber.runtime.transformers;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class TransformerWithNumberFormat<T extends Number> extends TransformerWithFormat<T> {

    @Override
    public T transform(Locale locale, String... arguments) throws TransformationException {
        return doTransform(super.transform(locale, arguments));
    }

    @Override
    public Format getFormat(Locale locale) {
        return NumberFormat.getNumberInstance(locale);
    }

    protected abstract T doTransform(Number argument);

}
