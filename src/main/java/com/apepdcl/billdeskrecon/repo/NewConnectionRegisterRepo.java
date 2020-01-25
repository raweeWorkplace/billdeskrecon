package com.apepdcl.billdeskrecon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apepdcl.billdeskrecon.beans.NewconnectionRegister;

@Repository
public interface NewConnectionRegisterRepo extends JpaRepository<NewconnectionRegister, String> {

	@Query(value = "SELECT CASE WHEN COUNT(E) > 0 THEN true ELSE false END from NewconnectionRegister E WHERE E.PR_NO=:PR_NO AND E.RECORD_STATUS='ACTIVE'")
	boolean getRecordByPrNo(@Param("PR_NO") String PR_NO);
	
}
