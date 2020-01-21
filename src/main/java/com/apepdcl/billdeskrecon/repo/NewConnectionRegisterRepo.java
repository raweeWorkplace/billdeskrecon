package com.apepdcl.billdeskrecon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apepdcl.billdeskrecon.beans.NewconnectionRegister;

@Repository
public interface NewConnectionRegisterRepo extends JpaRepository<NewconnectionRegister, String> {

	@Query(value = "FROM NewconnectionRegister WHERE PR_NO=:PR_NO")
	NewconnectionRegister getRecordByPrNo(@Param("PR_NO") String PR_NO);
}
