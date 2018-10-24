package pl.nspd.proj.generators;

import pl.nspd.proj.models.PaymentMethod;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static pl.nspd.proj.data.PaymentMethodData.paymentMethods;
import static pl.nspd.common.util.GeneratorUtil.id;

public class PaymentMethodGenerator {
    public static Set<PaymentMethod> generate() {
        return Arrays.stream(paymentMethods)
                .map(paymentMethod -> new PaymentMethod(id(), paymentMethod))
                .collect(Collectors.toSet());
    }
}
