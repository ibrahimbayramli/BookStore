package com.ibrahimbayramli.BookStore.repository.projection;

import java.time.LocalDateTime;

public interface IPurchaseItem {
    String getTitle();

    Double getPrice();

    LocalDateTime getPurchaseTime();
}
