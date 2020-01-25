package com.apepdcl.billdeskrecon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apepdcl.billdeskrecon.beans.ComplaintDetails;

@Repository
public interface ComplaintDetailsRepo extends JpaRepository<ComplaintDetails, String> {

	
	//@Query("FROM ComplaintDetails C WHERE C.PRNO=:PRNO ")
	@Query("SELECT CASE WHEN COUNT(E) > 0 THEN true ELSE false END from ComplaintDetails E WHERE E.PRNO=:PRNO AND E.RECORD_STATUS='ACTIVE'")
	Boolean fetchComplaintIdByPrNo(@Param("PRNO") String PRNO);


}
