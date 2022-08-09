package com.ibrahimbayramli.BookStore.service;

import com.ibrahimbayramli.BookStore.model.PurchaseHistory;
import com.ibrahimbayramli.BookStore.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchaseItemOfUser(Long userId);
}
