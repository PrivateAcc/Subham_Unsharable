package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.salesmanagement.exception.ProductException;
import com.capgemini.salesmanagement.service.ProductService;
import com.capgemini.salesmanagement.util.DBConnection;


public class DBConnectionTest {

	
		static ProductService productServicetest;
		static Connection dbCon;

		@BeforeAll
		public static void beforeClass() {
			productServicetest = new ProductService();
			dbCon = null;
		}

		@BeforeEach
		public void beforeEachTest() {
			System.out.println("----Starting DBConnection Test Case----\n");
		}


		/**
		 * Test case for Establishing Connection
		 * @throws SQL Exception
		 *@throws IO Exception
		 *@throws ClassNotFoundException
		 * @throws ProductException
		 **/
		
		
		@Test
		public void test() throws ProductException, ClassNotFoundException, IOException, SQLException {
			Connection dbCon = DBConnection.getConnection();
			Assert.assertNotNull(dbCon);
		}

		@AfterEach
		public void afterEachTest() {
			System.out.println("----End of DBConnection Test Case----\n");
		}

		@AfterAll
		public static void destroy() {
			System.out.println("\t----End of Tests----");
			productServicetest = null;
			dbCon = null;
		}

	}


