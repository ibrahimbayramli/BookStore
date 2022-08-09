package com.ibrahimbayramli.BookStore.repository;

import com.ibrahimbayramli.BookStore.model.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPurchaseHistoryRepository extends JpaRepository<PurchaseHistory,Long> {

}
