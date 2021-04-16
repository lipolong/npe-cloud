package demo.service;


import demo.entity.Payment;

/**
 * @author lp
 * @date 2021-04-15
 */
public interface IPaymentService {

    int create(Payment payment);

    Payment findById(Long id);

}
