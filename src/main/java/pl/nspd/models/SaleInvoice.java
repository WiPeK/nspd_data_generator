package pl.nspd.models;

import lombok.Data;

import java.util.Set;

@Data
public class SaleInvoice {
    public final Set<Sale> sales;
    public final Set<Invoice> invoices;
}
