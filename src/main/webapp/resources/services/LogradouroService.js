(function () {
	
	function LogradouroFactory ($resource) {
		return $resource('http://localhost:8080/ws-poc/api/logradouro:logradouroId',{},{
			query: {method:'GET',params:{logradouroId:''},isArray:true},
			update: { method: 'PUT', params: {logradouroId: '/@id'} }
		});
	};
	
	function CorreiosFactory ($resource) {
		return $resource('http://correiosapi.apphb.com/cep/:cepId',{},{
			query: {method:'GET',params:{cepId:'@cepId'}}
//			update: { method: 'PUT', params: {cepId: '/@cepId'} }
		});
	};
	
	angular
	  .module('LogradouroApp')
	  .factory('LogradouroFactory', LogradouroFactory)
	  .factory('CorreiosFactory', CorreiosFactory);
  
})();

