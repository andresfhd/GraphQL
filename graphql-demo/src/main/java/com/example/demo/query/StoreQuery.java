package com.example.demo.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.Client;
import com.example.demo.model.Sale;
import com.example.demo.model.Seller;
import com.example.demo.service.GraphQLService;

@Component
public class StoreQuery implements GraphQLQueryResolver {
	
	@Autowired
    private GraphQLService graphQLService;
    
	public Optional<Seller> findSellerById(final String idSeller) {
        return this.graphQLService.findById(idSeller);
    }
	
	public List<Sale> findAllSale() {
        return this.graphQLService.findAllSale();
    }
	
	public List<Client> findAllClient() {
		return this.graphQLService.findAllClient();
	}
}
