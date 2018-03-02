$(function(){
    const urlProjects = "http://localhost:8080/HelloWorld/webresources/com.dmr.helloworld.jpaentity.projects";
   doLoad();
    $(document).on('click','.delete',function(evt){
        var projectId = evt.target.dataset.projectId
        $.ajax({
            url: urlProjects+'/'+projectId,
            type: 'DELETE',
            success: function() {
                console.log("delete");
                doLoad();
            }
        });
        
    });
    
    
    $('#addProjectForm').submit(function(){
        
        var name = $("#project-name").val();
        var obj = {'name':name};
        
        $.ajax({
          url:urlProjects,
          type:"POST",
          data:obj,
          contentType:"application/json; charset=utf-8",
          dataType:"json",
          success: function(){
                    console.log("submit");
                    doLoad();

          }
        });
        
        
        return false;
    });
    
    function doLoad(){
        $.get(urlProjects).then(function(data){
               console.log(data);
               let $tbody = $('#tblProjects > tbody');
               $tbody.empty();
               for (project of data){
                   
                   //let tableRow = '<tr><td>'+project.id+'</td><td>'+project.name+'</td><td></td></tr>'
                   let tableRow = `
                       <tr>
                           <td>${project.id}</td>
                           <td>${project.name}</td>
                           <td>
                               <button class="btn btn-danger delete" data-project-id='${project.id}'>Delete</button>
                           </td>
                       </tr>            
                   `;


                   $tbody.append(tableRow);

               }
           });        
    }
    
    
});