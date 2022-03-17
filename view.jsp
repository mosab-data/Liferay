<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:resourceURL var="testAjaxResourceUrl"></portlet:resourceURL>

<a href="#" onclick="ajaxCall()">resourceURL in Ajax</a>

<script type="text/javascript">
function ajaxCall(){
    AUI().use('aui-io-request', function(A){
        A.io.request('${testAjaxResourceUrl}', {
               method: 'post',
               data: {
                   <portlet:namespace />sampleParam: 'value2',
               },
               on: {
                       success: function() {
                        alert(this.get('responseData'));
                    }
              }
        });
    });
}
</script>
