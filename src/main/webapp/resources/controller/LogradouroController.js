(function () {
	
	function LogradouroController ($scope, LogradouroFactory, CorreiosFactory) {
		$scope.getLogradouros = function(){
			$scope.logradouros = LogradouroFactory.query();
		};
		
		$scope.getLogradouroPorCep = function(){
			var cepFiltro = $scope.cepFiltro;
			if(typeof cepFiltro !== "undefined"){
				$scope.logradouro = CorreiosFactory.query({cepId:cepFiltro});
			}
		};
		
	};
	
	angular
	  .module('LogradouroApp')
	  .controller('LogradouroController', LogradouroController);
  
})();