(function () {
	
	function LogradouroFactory ($resource) {
		return $resource('http://localhost:8080/ws-poc/api/logradouro:logradouroId',{},{
			query: {method:'GET',params:{logradouroId:''},isArray:true},
			update: { method: 'PUT', params: {logradouroId: '/@id'} }
		});
	};
	
	angular
	  .module('LogradouroApp')
	  .factory('LogradouroFactory', LogradouroFactory);
  
})();

(function () {
	
	function CorreiosFactory ($resource) {
		return $resource('http://correiosapi.apphb.com/cep/:cepId',{},{
			query: {method:'GET',params:{cepId:'@cepId'},isArray:true}
//			update: { method: 'PUT', params: {logradouroId: '/@id'} }
		});
	};
	
	angular
	  .module('LogradouroApp')
	  .factory('CorreiosFactory', CorreiosFactory);
  
})();

