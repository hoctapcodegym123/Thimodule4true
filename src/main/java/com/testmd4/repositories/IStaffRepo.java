package com.testmd4.repositories;

import com.testmd4.model.Staff;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
@Component
public interface IStaffRepo extends PagingAndSortingRepository<Staff, Long> {
    List<Staff> findByStaffNameContaining(String name);

    Optional<Staff> findByStaffName(String name);
    Optional<Staff> findByStaffCode(String name);

    @Query(nativeQuery = true,value = "SELECT * FROM Staff ORDER BY staffAge")
    List<Staff> findAll();

}
