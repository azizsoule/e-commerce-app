package com.app.ecommerce.services;

import com.app.ecommerce.dtos.PaymentDetailDTO;
import com.app.ecommerce.models.PaymentDetail;
import com.app.ecommerce.repositories.PaymentDetailRepository;
import com.app.ecommerce.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentDetailService {

    @Autowired
    PaymentDetailRepository repository;

    @Autowired
    ModelMapper<PaymentDetailDTO, PaymentDetail> mapper;

    PaymentDetail findById(long idPaymentDetail) {
        return repository.getById(idPaymentDetail);
    }

    List<PaymentDetail> findAll() {
        return repository.findAll();
    }

    PaymentDetail save(PaymentDetail paymentDetail) {
        return repository.save(paymentDetail);
    }

    void delete(long idPaymentDetail) {
        repository.deleteById(idPaymentDetail);
    }

}
