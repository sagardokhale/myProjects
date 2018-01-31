var app = angular.module("MyApp", []);
app.controller("MyController", function($scope) {
	$scope.name = "Sagar";
	$scope.a=9;
	$scope.c=10;
	$scope.numberData=[1,2,3,4,5,6];
	$scope.incrementArray=function(){
		var i=10;
		i=i+1;
		$scope.numberData.push(i);
	};
	
	$scope.updateArray=function(){
		$scope.numberData[4]=100;
	};
	$scope.$watch('a',function(newValue,oldValue){
		if(newValue!=oldValue && $scope.c!=undefined && $scope.a!=undefined){
			$scope.c=parseInt($scope.c)+parseInt($scope.a);
		}
	});
	
	$scope.$watchCollection('numberData',function(newValue,oldValue){
		if(newValue!=oldValue ){
			console.log("Increment array called");
		}
	});
});


app.directive("message", function($interpolate) {
	return {
		compile : function(tElement, tAttributes) {
			tElement.css("border","1px solid #C0C0C0");
            console.log("In compile.........."+tAttributes.text);
			return {
				pre : function(scope,ielement,iattr) {
					console.log("In pre "+iattr.text);
				},
				post : function(scope,ielement,iattr) {
					console.log("In post"+iattr.text);
					if(iattr.text==4){
						ielement.css("border","1px solid red");
					}
					ielement.on("click",scope.btnClick);
				}
			}

		},
		controller : function($scope,$element,$attrs) {
			var v=$interpolate($attrs.text)($scope);
			console.log("In controller.........."+v);
			
			$scope.btnClick=function(){
				alert(v);
			}
		},
	}
});


app.controller('MyController2',['$scope',function($scope){
	$scope.a=89;
}]);


app.directive('message1',function(){
	return
	{
		templateUrl:'msg1.html'
	}
	
});