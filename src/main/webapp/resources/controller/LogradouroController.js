(function () {
	
	function LogradouroController ($scope, LogradouroFactory, CorreiosFactory) {
		$scope.getLogradouros = function(){
			$scope.logradouros = LogradouroFactory.query();
		};
		
		$scope.getLogradouroPorCep = function(){
			var cepFiltro = $scope.cepFiltro;
			if(typeof cepFiltro !== "undefined"){
				$scope.endereco = CorreiosFactory.query({cepId:cepFiltro});
				var teste = $scope.endereco
			}
		};
		
		$scope.salvar = function(objeto) {
			LogradouroFactory.save(objeto,$scope.salvarSuccess,$scope.salvarError);
		};
		
		$scope.salvarSuccess = function(data) {
			alert(data);
		};
		
		$scope.salvarError = function(data) {
			alert(data);
		};
		
	};
	
	angular
	  .module('LogradouroApp')
	  .controller('LogradouroController', LogradouroController);
  
})();