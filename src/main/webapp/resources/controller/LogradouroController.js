(function () {
	
	function LogradouroController ($scope, LogradouroFactory) {
		$scope.getLogradouros = function(){
			$scope.logradouros = LogradouroFactory.query();
		};
		
	};
	
	angular
	  .module('LogradouroApp')
	  .controller('LogradouroController', LogradouroController);
  
})();