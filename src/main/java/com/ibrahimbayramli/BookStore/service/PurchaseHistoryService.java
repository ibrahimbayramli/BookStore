package com.ibrahimbayramli.BookStore.service;

import com.ibrahimbayramli.BookStore.model.PurchaseHistory;
import com.ibrahimbayramli.BookStore.repository.IPurchaseHistoryRepository;
import com.ibrahimbayramli.BookStore.repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService {

    @Autowired
    private IPurchaseHistoryRepository purchaseHistoryRepository;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchaseItemOfUser(Long userId){
        return purchaseHistoryRepository.findAllPurchaseOfUser(userId);
    }

}
