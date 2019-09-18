package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Client;
import com.example.demo.model.Sale;
import com.example.demo.model.Seller;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.SaleRepository;
import com.example.demo.repository.SellerRepository;

@Service
public class GraphQLService {

	private SellerRepository sellerRepository;
	private SaleRepository saleRepository;
	private ClientRepository clientRepository;

	@Autowired
	public GraphQLService(SellerRepository sellerRepository, SaleRepository saleRepository, ClientRepository clientRepository) {
		this.sellerRepository = sellerRepository;
		this.saleRepository = saleRepository;
		this.clientRepository = clientRepository;
	}

	@Transactional(readOnly = true)
	public Optional<Seller> findById(final String id) {
		return this.sellerRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public List<Sale> findAllSale() {
		return this.saleRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public List<Client> findAllClient() {
		return this.clientRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Client saveClient(String id, String fullName) {
		return this.clientRepository.saveAndFlush(new Client(id, fullName));
	}
}