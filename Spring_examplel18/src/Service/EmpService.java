package Service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import Dao.empDao;
import Model.Employee;

public class EmpService {
	empDao eDao;
	TransactionTemplate txTemplate;
	boolean trans_status;
	
	public empDao geteDao() {
		return eDao;
	}


	public void seteDao(empDao eDao) {
		this.eDao = eDao;
	}


	public TransactionTemplate getTxTemplate() {
		return txTemplate;
	}


	public void setTxTemplate(TransactionTemplate txTemplate) {
		this.txTemplate = txTemplate;
	}


	
	
	
	public boolean addEmp(final Employee b)
	{
		trans_status=false;
			
		txTemplate.execute(new TransactionCallback<Void>() {
            
			public Void doInTransaction(TransactionStatus txStatus) {
				try {
					System.out.println("Am in transaction");
					eDao.insert(b.getEmpid(),b.getEmpName(),b.getSalary());
					//eDao.insert(b.getEmpid(),b.getEmpName(),b.getSalary());
					System.out.println("Employee inserted");
					trans_status=true;
				} catch (RuntimeException e) {
					txStatus.setRollbackOnly();
					System.out.println("insert Employee or incr bookmaster failed so transaction rolled back");
					//throw e;
					trans_status=false;
					}
				
				return null;
			}
			
		});
		
		return trans_status;
	}
}
